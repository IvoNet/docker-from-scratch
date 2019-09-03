/*
 * Copyright 2019 Ivo Woltring <WebMaster@ivonet.nl>
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

package nl.ivonet.service;

import org.eclipse.microprofile.health.Health;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

import javax.enterprise.context.ApplicationScoped;

/**
 * A basic MicroProfile health checker for your application.
 *
 * This health checker can be adjusted as needed.
 *
 * The (test) endpoint is published: <a href="http://localhost:8080/health">http://localhost:8080/health</a>
 */
@Health
@ApplicationScoped
public class HealthCheckService implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.named("health")
                                  .up()
                                  .withData("Author", "Ivo Woltring")
                                  .withData("Website", "https://www.ivonet.nl")
                                  .build();
    }
}
