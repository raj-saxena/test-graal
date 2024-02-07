package com.example.testgraal;

import org.springframework.aot.hint.annotation.RegisterReflectionForBinding;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportRuntimeHints;
import org.springframework.vault.support.VaultResponse;

@SpringBootApplication
@ConfigurationPropertiesScan
@ImportRuntimeHints(value = {VaultRuntimeHints.class} )
@RegisterReflectionForBinding({VaultResponse.class})
public class TestGraalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGraalApplication.class, args);
	}

}
