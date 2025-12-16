package com.foykon.portfolioservice.service.impl;

import com.foykon.portfolioservice.repository.ProjectRepository;
import com.foykon.portfolioservice.service.IProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements IProjectService {

    private final ProjectRepository projectRepository;

}
