/*
 * Copyright 2016 Lime - HighTech Solutions s.r.o.
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
 */

package io.getlime.push.repository.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Class representing application tokens used to authenticate against APNs or FCM services.
 *
 * @author Petr Dvorak, petr@lime-company.eu
 */
@Entity(name = "push_app_credential")
public class AppCredentialEntity implements Serializable {

    private static final long serialVersionUID = -8904070389354612019L;

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "push_app_credential", sequenceName = "push_credential_seq")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "push_app_credential")
    private Long id;

    @Column(name = "app_id", nullable = false, updatable = false)
    private Long appId;

    @Column(name = "ios_private_key")
    private byte[] iosPrivateKey;

    @Column(name = "ios_team_id")
    private String iosTeamId;

    @Column(name = "ios_key_id")
    private String iosKeyId;

    @Column(name = "ios_bundle")
    private String iosBundle;

    @Column(name = "android_server_key")
    private String androidServerKey;

    @Column(name = "android_bundle")
    private String androidBundle;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getIosBundle() {
        return iosBundle;
    }

    public void setIosBundle(String iosBundle) {
        this.iosBundle = iosBundle;
    }

    public byte[] getIosPrivateKey() {
        return iosPrivateKey;
    }

    public void setIosPrivateKey(byte[] iosPrivateKey) {
        this.iosPrivateKey = iosPrivateKey;
    }

    public String getIosTeamId() {
        return iosTeamId;
    }

    public void setIosTeamId(String iosTeamId) {
        this.iosTeamId = iosTeamId;
    }

    public String getIosKeyId() {
        return iosKeyId;
    }

    public void setIosKeyId(String iosKeyId) {
        this.iosKeyId = iosKeyId;
    }

    public String getAndroidServerKey() {
        return androidServerKey;
    }

    public void setAndroidServerKey(String androidServerKey) {
        this.androidServerKey = androidServerKey;
    }

    public String getAndroidBundle() {
        return androidBundle;
    }

    public void setAndroidBundle(String androidBundle) {
        this.androidBundle = androidBundle;
    }
}
