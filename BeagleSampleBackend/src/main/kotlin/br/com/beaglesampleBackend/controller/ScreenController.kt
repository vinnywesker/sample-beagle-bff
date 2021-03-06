/*
 * Copyright 2020 ZUP IT SERVICOS EM TECNOLOGIA E INOVACAO SA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package br.com.beaglesampleBackend.controller

import br.com.beaglesampleBackend.service.FirstScreenBeagleService
import br.com.beaglesampleBackend.service.HomeCarouselOptionsService
import br.com.beaglesampleBackend.service.LoginScreenService
import br.com.beaglesampleBackend.service.PasswordScreenService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
open class CorsConfig : WebMvcConfigurer {
    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedOrigins("*")
                .allowedMethods("*")
                .allowedHeaders("*")
        // .exposedHeaders("*")
    }
}

@RestController
class ScreenController(
        private val firstScreenBeagleService: FirstScreenBeagleService,
        private val loginScreenService: LoginScreenService,
        private val passwordScreenService: PasswordScreenService,
        private val carouselOptions: HomeCarouselOptionsService
) {
    @GetMapping("/screen")
    fun getFirstScreen() = firstScreenBeagleService.createScreenBeagle()

    @GetMapping("/login")
    fun getLoginScreen() = loginScreenService.createLoginScreen()

    @GetMapping("/password")
    fun getPasswordScreen() = passwordScreenService.createPasswordScreen()

    @GetMapping("/carousel-options")
    fun getCarouselOptions() = carouselOptions.getHomeCarouselOptions()
}