/*
 * Copyright 2021 The Bank of New York Mellon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package bnymellon.training.spring.framework.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//TODO: Ensure that this Configuration is stereotyped.
@Configuration
@ComponentScan(basePackages = {"bnymellon.training.spring.framework.model"})
public class Lab03DIConfiguration {

    //TODO: Create a bean each for:

    // twoPlane2016Order
    @Bean(name = "twoPlane2016")
    @Qualifier("twoPlane2016")
    public Vehicle myVeichle() {
        return new Vehicle("plane", 2016);
    }


    // sixFlatbed2017Order
    @Bean(name = "sixFlatbed2017")
    @Qualifier("sixFlatbed2017")
    public Vehicle myVeichle2() {
        return new Vehicle("flatbed", 2017);
    }




    // TODO: Add qualifiers.

    @Bean ("twoPlane2016Order")
    @Qualifier("twoPlane2016Order")
    public BulkVehicleOrder twoPlane2016Order() {
        return new BulkVehicleOrder(myVeichle(), 2);
    }




    @Bean ("sixFlatbed2017Order")
    @Qualifier("sixFlatbed2017Order")
    public BulkVehicleOrder sixFlatbed2017Order() {
        return new BulkVehicleOrder(myVeichle2(), 6);
    }
}
