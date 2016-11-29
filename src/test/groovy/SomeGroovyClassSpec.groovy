import spock.lang.Specification

/**
 * Created by Eugen Feit on 11/29/16.
 */
class SomeGroovyClassSpec extends Specification {

	def "should generate hello world"() {
		given:
		def groovyClass = new SomeGroovyClass()

		when:
		def helloWorld = groovyClass.getHelloWorld()

		then:
		helloWorld == "Hello world!"
	}

}
