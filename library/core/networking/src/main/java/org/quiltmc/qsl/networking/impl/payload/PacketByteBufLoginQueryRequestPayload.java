/*
 * Copyright 2023 The Quilt Project
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

package org.quiltmc.qsl.networking.impl.payload;

import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.packet.s2c.login.payload.CustomQueryPayload;
import net.minecraft.util.Identifier;

public record PacketByteBufLoginQueryRequestPayload(Identifier id, PacketByteBuf data) implements CustomQueryPayload {
	@Override
	public void write(PacketByteBuf byteBuf) {
		byteBuf.writeBytes(this.data);
	}
}