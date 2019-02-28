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
package arcus.app.device.details;

public class IrrigationTimeChangedEvent {

    private int wateringTime;
    private String wateringZone;
    private String deviceId;

    public IrrigationTimeChangedEvent(String deviceId, String wateringZone, int wateringTime) {
        this.wateringZone = wateringZone;
        this.wateringTime = wateringTime;
        this.deviceId = deviceId;
    }

    public int getWateringTime() {
        return this.wateringTime;
    }

    public String getWateringZone() {
        return this.wateringZone;
    }

    public String getDeviceId() {
        return deviceId;
    }

}