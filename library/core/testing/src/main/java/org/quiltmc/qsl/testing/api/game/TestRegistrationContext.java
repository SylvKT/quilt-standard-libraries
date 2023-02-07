/*
 * Copyright 2022-2023 QuiltMC
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

package org.quiltmc.qsl.testing.api.game;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.testing.impl.game.QuiltGameTestImpl;

/**
 * Represents the registration context of modded tests.
 *
 * @param mod the mod for which the tests are registered
 */
public record TestRegistrationContext(ModContainer mod) {
	/**
	 * Registers an additional test class.
	 *
	 * @param testClass the test class to register
	 */
	public void register(Class<? extends QuiltGameTest> testClass) {
		QuiltGameTestImpl.registerTestClass(this.mod, testClass);
	}
}
