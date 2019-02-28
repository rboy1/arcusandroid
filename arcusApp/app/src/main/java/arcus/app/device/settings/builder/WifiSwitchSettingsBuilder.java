/*
 *  Copyright 2019 Arcus Project.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package arcus.app.device.settings.builder;

import arcus.app.device.settings.core.Setting;
import arcus.app.device.settings.fragment.WifiSwitchSettingsFragment;
import arcus.app.device.settings.style.TransitionToFragmentSetting;


public class WifiSwitchSettingsBuilder implements SettingBuilder {

    private Setting setting;

    private WifiSwitchSettingsBuilder(String title, String description, String ssid, String deviceAddress) {
        this.setting = new TransitionToFragmentSetting(title, description, WifiSwitchSettingsFragment.newInstance(ssid, deviceAddress));
    }

    public static WifiSwitchSettingsBuilder with (String title, String description, String ssid, String deviceAddress) {
        return new WifiSwitchSettingsBuilder(title, description, ssid, deviceAddress);
    }

    @Override
    public Setting build() {
        return setting;
    }
}