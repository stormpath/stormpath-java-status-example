/*
 * Copyright 2015 Stormpath, Inc.
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
package quickstart;

import com.stormpath.sdk.account.Account;
import com.stormpath.sdk.account.AccountList;
import com.stormpath.sdk.account.AccountStatus;
import com.stormpath.sdk.account.Accounts;
import com.stormpath.sdk.application.Application;
import com.stormpath.sdk.application.ApplicationList;
import com.stormpath.sdk.application.Applications;
import com.stormpath.sdk.client.Client;
import com.stormpath.sdk.client.Clients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quickstart {

    private static final Logger log = LoggerFactory.getLogger(Quickstart.class);

    private static String APPLICATION_NAME = "My Application";

    public static void main(String[] args) {

        Client client = Clients.builder().build();

        ApplicationList applications = client.getApplications(
            Applications.where(Applications.name().eqIgnoreCase(APPLICATION_NAME))
        );

        Application application = applications.single();
        AccountList accounts = application.getAccounts(
            Accounts.where(Accounts.status().eq(AccountStatus.UNVERIFIED))
        );

        for(Account account : accounts) {
            account.setStatus(AccountStatus.ENABLED);
            account.save();
            System.out.println(account.getEmail());
        }

    }
}
