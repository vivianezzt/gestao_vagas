package br.com.vivianedev.gestao_vagas.modules.candidate.useCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.vivianedev.gestao_vagas.exceptions.UserFoundException;
import br.com.vivianedev.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.vivianedev.gestao_vagas.modules.company.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {

    @Autowired
    private CompanyRepository companyRepository;
    public CompanyEntity execute(CompanyEntity companyEntity){
        this.companyRepository
                .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
                .ifPresent(user -> {
                    throw new UserFoundException("Este username já está em uso");
                });
        return this.companyRepository.save(companyEntity);

    }
}
