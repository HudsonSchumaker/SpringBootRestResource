package br.com.schumaker.data.model

import org.springframework.stereotype.Repository

@Repository
class ConsoleInMemoryRepository(var consoles: HashMap<String, Console>): CommonRepository<Console, String> {


    override fun save(domain: Console): Console? {
        val result = consoles.get(domain.id)
        if (null != result) {

        }

    }

    override fun save(domains: Collection<Console>): Iterable<Console> {
        TODO("Not yet implemented")
    }

    override fun delete(domain: Console) {
        TODO("Not yet implemented")
    }

    override fun findById(id: String): Console {
        TODO("Not yet implemented")
    }

    override fun findAll(): Iterable<Console> {
        TODO("Not yet implemented")
    }
}