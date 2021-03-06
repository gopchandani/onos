/*
 * Copyright 2016-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onosproject.lisp.ctl.impl;

import io.netty.buffer.ByteBuf;
import org.onosproject.lisp.msg.protocols.LispMessage;
import org.onosproject.lisp.msg.protocols.LispType;

import java.net.InetSocketAddress;

/**
 * Adapter for testing against a LISP message.
 */
public class LispMessageAdapter implements LispMessage {
    LispType type;

    private LispMessageAdapter() {}

    public LispMessageAdapter(LispType type) {
        this.type = type;
    }

    @Override
    public LispType getType() {
        return type;
    }

    @Override
    public void configSender(InetSocketAddress sender) {

    }

    @Override
    public InetSocketAddress getSender() {
        return null;
    }

    @Override
    public void writeTo(ByteBuf byteBuf) {

    }

    @Override
    public Builder createBuilder() {
        return null;
    }
}
