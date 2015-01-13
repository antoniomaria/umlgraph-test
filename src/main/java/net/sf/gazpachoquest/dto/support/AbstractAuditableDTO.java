/*******************************************************************************
 * Copyright (c) 2014 antoniomariasanchez at gmail.com. All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0 which accompanies this distribution, and is
 * available at http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors: antoniomaria - initial API and implementation
 ******************************************************************************/
package net.sf.gazpachoquest.dto.support;

import java.time.LocalDateTime;

import net.sf.gazpachoquest.dto.AuditorDTO;


@SuppressWarnings("serial")
public abstract class AbstractAuditableDTO extends AbstractIdentifiableDTO {

    private AuditorDTO createdBy;

    private LocalDateTime createdDate;

    private AuditorDTO lastModifiedBy;

    private LocalDateTime lastModifiedDate;

    protected AbstractAuditableDTO() {
        super();
    }

    public AuditorDTO getCreatedBy() {
        return createdBy;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public AuditorDTO getLastModifiedBy() {
        return lastModifiedBy;
    }

    public LocalDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setCreatedBy(final AuditorDTO createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(final LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedBy(final AuditorDTO lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setLastModifiedDate(final LocalDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

}
