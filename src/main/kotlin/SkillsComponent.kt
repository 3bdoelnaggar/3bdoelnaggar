import kotlinx.css.Color
import kotlinx.css.backgroundColor
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

class SkillsComponent:RComponent<RProps,RState>() {
    override fun RBuilder.render() {
      styledDiv {
          css { backgroundColor= Color.lightGreen }
      }
    }
}