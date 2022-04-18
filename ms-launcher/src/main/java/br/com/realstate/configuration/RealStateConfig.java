package br.com.realstate.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.realstate.adapters.RealStateJpaAdapter;
import br.com.realstate.ports.api.RealStateServicePort;
import br.com.realstate.ports.spi.RealStatePersistencePort;
import br.com.realstate.service.RealStateServiceImpl;

@Configuration
public class RealStateConfig {

    @Bean
    public RealStatePersistencePort realStatePersistence(){
        return new RealStateJpaAdapter();
    }

    @Bean
    public RealStateServicePort realStateService(){
        return new RealStateServiceImpl(realStatePersistence());
    }
}
