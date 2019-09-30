/*
 * Copyright (c) 2014. Heinz Max Kabutz , Sven Ruppert
 *   We licenses
 *   this file to you under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License. You may
 *   obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package eu.javaspecialists.books.dynamicproxies.shortcut.chap8.chap8_1.test;

import eu.javaspecialists.books.dynamicproxies.shortcut.chap8.chap8_1.*;
import eu.javaspecialists.books.dynamicproxies.shortcut.chap8.chap8_1.moralfibre.*;
import eu.javaspecialists.books.dynamicproxies.shortcut.chap8.chap8_1.moralfibre.virtual.proxy.generator.*;

/**
 * Created by Sven Ruppert on 14.01.14.
 */
public class CompanyTest {

  public static void main(String[] args) {
    Company company = new Company("Cretesoft", 10000.0,
      new MoralFibreImpl());
    company.makeMoney();
    company.damageEnvironment();
    company.becomeFocusOfMediaAttention();

    Company company2 = new Company("Cretesoft2", 20000.0,
      ProxyGenerator.make(MoralFibre.class,
        MoralFibreImpl.class,
        Concurrency.NONE));
    company2.makeMoney();
    company2.makeMoney();
    company2.makeMoney();
    company2.damageEnvironment();
    company2.becomeFocusOfMediaAttention();
  }

}