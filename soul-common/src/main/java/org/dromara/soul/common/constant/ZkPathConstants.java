/*
 *
 *  * Licensed to the Apache Software Foundation (ASF) under one or more
 *  * contributor license agreements.  See the NOTICE file distributed with
 *  * this work for additional information regarding copyright ownership.
 *  * The ASF licenses this file to You under the Apache License, Version 2.0
 *  * (the "License"); you may not use this file except in compliance with
 *  * the License.  You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package org.dromara.soul.common.constant;

/**
 * ZkPathConstants.
 * @author xiaoyu(Myth)
 */
public final class ZkPathConstants implements Constants {

    public static final String SELECTOR_PARENT = "/skyway/selector";

    public static final String SELECTOR_JOIN_RULE = "-";

    private static final String PLUGIN_PARENT = "/skyway/plugin";

    private static final String RULE_PARENT = "/skyway/rule";

    public static final String APP_AUTH_PARENT = "/skyway/auth";

    /**
     * acquire app_auth_path.
     * @param appKey appKey
     * @return  app_auth_path
     */
    public static String buildAppAuthPath(final String appKey){
        return String.join("/", APP_AUTH_PARENT, appKey);
    }

    /**
     * buildPluginPath.
     *
     * @param pluginName pluginName
     * @return zk path for plugin
     */
    public static String buildPluginPath(final String pluginName) {
        return String.join("/", PLUGIN_PARENT, pluginName);
    }

    /**
     * buildSelectorParentPath.
     *
     * @param pluginName pluginName
     * @return zk path for selector
     */
    public static String buildSelectorParentPath(final String pluginName) {
        return String.join("/", SELECTOR_PARENT, pluginName);
    }

    /**
     * buildSelectorRealPath.
     *
     * @param pluginName pluginName
     * @param selectorId selectorId
     * @return zk full path for selector
     */
    public static String buildSelectorRealPath(final String pluginName, final String selectorId) {
        return String.join("/", SELECTOR_PARENT, pluginName, selectorId);
    }

    /**
     * buildRuleParentPath.
     *
     * @param pluginName pluginName
     * @return zk rule parent path.
     */
    public static String buildRuleParentPath(final String pluginName) {
        return String.join("/", RULE_PARENT, pluginName);
    }

    /**
     * buildRulePath.
     *
     * @param pluginName pluginName
     * @param selectorId selectorId
     * @param ruleId     ruleId
     * @return  /skyway/rule/pluginName/selectorId-ruleId
     */
    public static String buildRulePath(final String pluginName, final String selectorId, final String ruleId) {
        return String.join("/", buildRuleParentPath(pluginName), selectorId + SELECTOR_JOIN_RULE + ruleId);
    }

}
