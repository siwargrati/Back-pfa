package org.sid.dao;

import org.sid.entities.Fichiers;
//interface Dao  bassée spring Data (JpaRepository) dans cette interface il existe déja  toutes les opérations qui permet de consulter
//ajouter modifier....
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
//avec cette notation et lorsque on aura plusieurs micro service  on developppera plus les class Controller on aura plus besoin des fonctionalité tel que l'ajout, supp ..
//car leur géneration sera automatique apartir de cettte anotation
@RepositoryRestResource  
@Repository
public interface FichiersRepository extends JpaRepository<Fichiers,Long>{

}