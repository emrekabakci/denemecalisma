package com.emrek.calisma.service.implementation;

import com.emrek.calisma.model.Server;
import com.emrek.calisma.repo.ServerRepo;
import com.emrek.calisma.service.ServerService;
import lombok.RequiredArgsConstructor;

import java.util.Collection;

@RequiredArgsConstructor
public class ServerServiceImplementation implements ServerService {

    private final ServerRepo serverRepo;
    @Override
    public Server create(Server server) {
        return null;
    }

    @Override
    public Collection<Server> list(int limit) {
        return null;
    }

    @Override
    public Server get(Long id) {
        return null;
    }

    @Override
    public Server update(Server server) {
        return null;
    }

    @Override
    public Boolean delete(Long id) {
        return null;
    }
}
