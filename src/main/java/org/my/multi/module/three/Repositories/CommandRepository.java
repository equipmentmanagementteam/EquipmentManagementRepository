/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.my.multi.module.three.Repositories;

import org.my.multi.module.three.Entities.Command;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author marwa
 */
public interface CommandRepository extends CrudRepository<Command, Integer>{
    
}
