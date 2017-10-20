/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.indocyber.mvnfirst;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Currency quote = restTemplate.getForObject("https://openexchangerates.org/api/latest.json?app_id=b93dc3aee1a44f3e82d7bb3abcabdfce&base=USD", Currency.class);
        log.info(quote.toString());
    }

}
