package com.moustakim.activite5eventsourcingmoustakim;

import commands.aggregates.AccountAggregate;
import org.axonframework.common.jpa.EntityManagerProvider;
import org.axonframework.eventhandling.EventBus;
import org.axonframework.eventsourcing.EventSourcingRepository;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.axonframework.messaging.annotation.ParameterResolverFactory;
import org.axonframework.modelling.command.GenericJpaRepository;
import org.axonframework.modelling.command.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Activite5EventSourcingMoustakimApplication {

    public static void main(String[] args) {
        SpringApplication.run(Activite5EventSourcingMoustakimApplication.class, args);
    }
    //@Bean
    public Repository<AccountAggregate> accountAggregateRepository(EntityManagerProvider emp, ParameterResolverFactory prf, EventBus eb){
        return GenericJpaRepository.builder(AccountAggregate.class)
                .entityManagerProvider(emp)
                .parameterResolverFactory(prf)
                .eventBus(eb)
                .build();
    }

    //@Bean
    public EventSourcingRepository<AccountAggregate> eventSourcingRepository(EventStore eventStore, ParameterResolverFactory prf){
        return EventSourcingRepository.builder(AccountAggregate.class)
                .eventStore(eventStore)
                .parameterResolverFactory(prf)
                .build();
    }
}
