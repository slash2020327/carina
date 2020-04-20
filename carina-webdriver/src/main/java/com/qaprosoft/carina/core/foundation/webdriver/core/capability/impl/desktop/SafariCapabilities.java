/*******************************************************************************
 * Copyright 2013-2020 QaProSoft (http://www.qaprosoft.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.qaprosoft.carina.core.foundation.webdriver.core.capability.impl.desktop;

import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.qaprosoft.carina.core.foundation.webdriver.core.capability.AbstractCapabilities;

public class SafariCapabilities extends AbstractCapabilities {

    public DesiredCapabilities getCapability(String testName) {
        DesiredCapabilities capabilities = DesiredCapabilities.safari();
        capabilities = initBaseCapabilities(capabilities, BrowserType.SAFARI, testName);
        return capabilities;
    }
}
