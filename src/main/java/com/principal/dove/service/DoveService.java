package com.principal.dove.service;

import com.principal.dove.document.Survey;
import com.principal.dove.dto.SurveyDto;
import com.principal.dove.repository.DoveRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DoveService {
    private final DoveRepository repository;
    private final ModelMapper modelMapper;

    @Autowired
    public DoveService(DoveRepository repository, ModelMapper modelMapper) {
        this.repository = repository;
        this.modelMapper = modelMapper;
    }

    public SurveyDto save(SurveyDto survey) {
        return modelMapper.map(repository.save(modelMapper.map(survey, Survey.class)),SurveyDto.class);
    }
}
