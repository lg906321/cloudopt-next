/*
 * Copyright 2017 Cloudopt.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */
package net.cloudopt.next.web.json

import io.vertx.core.json.Json
import net.cloudopt.next.aop.Beaner
import net.cloudopt.next.aop.Classer
import net.cloudopt.next.web.config.ConfigManager


/*
 * @author: Cloudopt
 * @Time: 2018/1/9
 * @Description: JsonProvider Interface
 */

object Jsoner:JsonProvider{

    @JvmStatic private val jsonProvider:JsonProvider = Beaner.newInstance(Classer.loadClass(ConfigManager.webConfig.jsonProvider))

    override fun toJsonString(obj: Any):String {
        return jsonProvider.toJsonString(obj)
    }

    override fun toJsonObject(s: String, clazz: Class<*>): Any {
        return jsonProvider.toJsonObject(s,clazz)
    }

    override fun toJsonObject(s: String): Any {
        return jsonProvider.toJsonObject(s)
    }

    override fun toJsonArray(s: String): Any {
        return jsonProvider.toJsonArray(s)
    }

    override fun toJsonArray(s: String, clazz: Class<*>): Any {
        return jsonProvider.toJsonArray(s,clazz)
    }

}