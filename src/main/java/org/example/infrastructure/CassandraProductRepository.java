package org.example.infrastructure;


import org.example.domain.Product;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraProductRepository extends CassandraRepository<Product, String> {
}
