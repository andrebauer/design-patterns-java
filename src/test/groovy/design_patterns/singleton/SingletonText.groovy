package design_patterns.singleton

import spock.lang.Specification

class SingletonTest extends Specification {
    def "a singleton has an instance"() {
        expect:
        def singleton = Singleton.getInstance()
        singleton != null
    }

    def "a singleton exisits only once"() {
        setup:
        def singleton = Singleton.getInstance()
        def data = "Data"

        when:
        singleton.setData(data)

        then:
        Singleton.getInstance().getData() == data
    }
}