import spock.lang.Specification

class GameSpec extends Specification {

    Game game = new Game()

    def "gutter ball game"() {
        def constantPins = 0
        when:
        rollConsistently(constantPins)


        then:
        game.score() == 0
    }

    def "all ones game"() {
        def constantPins = 1
        when:
        rollConsistently(constantPins)

        then:
        game.score() == 20
    }

    def rollConsistently(int constantPins) {
        (1..20).each {
            game.roll(constantPins)
        }
    }

}