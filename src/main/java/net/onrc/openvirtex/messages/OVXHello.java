/*******************************************************************************
 * Copyright 2014 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.onrc.openvirtex.messages;

import net.onrc.openvirtex.elements.datapath.OVXSwitch;
import net.onrc.openvirtex.elements.datapath.PhysicalSwitch;

import org.openflow.protocol.OFHello;

public class OVXHello extends OFHello implements Virtualizable, Devirtualizable {

    @Override
    public void devirtualize(final OVXSwitch sw) {
        // TODO: Log error, we should never receive this message here
        return;

    }

    @Override
    public void virtualize(final PhysicalSwitch sw) {
        // TODO: Log error, we should never receive this message here
        return;

    }

}
