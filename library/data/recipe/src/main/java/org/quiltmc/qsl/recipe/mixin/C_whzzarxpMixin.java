/*
 * Copyright 2023 QuiltMC
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

package org.quiltmc.qsl.recipe.mixin;

import com.google.gson.JsonObject;
import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.unmapped.C_ngeyonui;
import net.minecraft.unmapped.C_ywfnzhyw;

import org.quiltmc.qsl.recipe.api.serializer.QuiltRecipeSerializer;

@Mixin(C_ngeyonui.C_whzzarxp.class)
public abstract class C_whzzarxpMixin implements QuiltRecipeSerializer<C_ngeyonui> {
	@Override
	public JsonObject toJson(C_ngeyonui recipe) {
		var accessor = (C_ngeyonuiAccessor) recipe;

		return new C_ywfnzhyw.C_esuzwjjm(
				recipe.getId(),
				null,
				accessor.getTemplate(), accessor.getBase(), accessor.getAddition(),
				null,
				null
		).toJson();
	}
}