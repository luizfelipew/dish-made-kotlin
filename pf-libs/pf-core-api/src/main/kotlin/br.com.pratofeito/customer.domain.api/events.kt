package br.com.pratofeito.customer.domain.api

import br.com.pratofeito.common.domain.api.AuditableAbstractEvent
import br.com.pratofeito.common.domain.api.model.AuditEntry
import br.com.pratofeito.customer.domain.api.model.CustomerId
import br.com.pratofeito.customer.domain.api.model.CustomerOrderId

abstract class CustomerEvent(open val aggregateIdentifier: CustomerId, override val auditEntry: AuditEntry)
    : AuditableAbstractEvent(auditEntry)


abstract class CustomerOrderEvent(open val aggregateIdentifier: CustomerOrderId, override val auditEntry: AuditEntry)
    : AuditableAbstractEvent(auditEntry)