package com.bcc.data.repo;

import com.bcc.data.entity.Folder;
import org.springframework.data.repository.CrudRepository;

/**
 * FolderRepository
 *
 * @author Kevin Hagel
 * @since 20.02.22
 */
public interface FolderRepository extends CrudRepository<Folder, Long> {

}
