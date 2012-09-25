import spock.lang.*


class QuickSortSpec extends Specification {

    Boiler boiler

    void setup(){

	boiler = new Boiler()
    }

    def "should boil"() {

	expect:
	boiler.boil()
    }

}
