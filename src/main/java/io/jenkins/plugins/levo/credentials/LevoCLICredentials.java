/*
 * Copyright 2022 Levo Inc
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.jenkins.plugins.levo.credentials;

import com.cloudbees.plugins.credentials.NameWith;
import com.cloudbees.plugins.credentials.common.StandardCredentials;
import hudson.util.Secret;

import java.io.IOException;

@NameWith(
        value = LevoCLICredentials.NameProvider.class,
        priority = 32
)
public interface LevoCLICredentials extends StandardCredentials {
    String getOrganizationId();
    Secret getCLIAuthorizationKey() throws IOException, InterruptedException;
}
