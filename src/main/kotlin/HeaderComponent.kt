import kotlinx.css.*
import kotlinx.css.properties.TextDecoration
import kotlinx.html.classes
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState

import styled.*

val styles = CSSBuilder().apply {
    val block: CSSBuilder.() -> Unit = {
        fontFamily = "sans-serif"
    }
    body {
        backgroundColor = Color("#FFCC00")
        padding = "20px"
        margin = "0px"
    }
    h1 {
        fontFamily = "sans-serif"
    }
    h2 {
        fontFamily = "sans-serif"
    }
    link(block)
    p(block)
    ul(block)

}
val liStyle: CSSBuilder.() -> Unit = {
    display = Display.inline
    listStyleType = ListStyleType.none
    margin = "0px"

}
val aStyle: CSSBuilder.() -> Unit = {
    color = Color("#FFF")
    fontWeight = FontWeight.bold
    textDecoration = TextDecoration.none
    padding = "20px"
    display = Display.inlineBlock
}

class HeaderComponent : RComponent<RProps, RState>() {

    override fun RBuilder.render() {
        StyledComponents.injectGlobal(styles.toString())
        styledDiv {
            styledH1 {
                +"Abdalla Elnaggar"
            }
//            hashRouter {
//                switch {
//                    route("/skills", SkillsComponent::class, exact = true)
//                    route("/projects", ProjectsComponent::class, exact = true)
//
//                }
//            }
                styledUl {
                    css {
                        backgroundColor = Color("#111")
                        padding = "0px"
                    }
                    styledLi {
                        css(liStyle)
                        styledA {
                            css(aStyle)
                            attrs { href = "/" }
                            +"Home"
                        }
                    }

                    styledLi {
                        css(liStyle)
                        styledA {
                            css(aStyle)
                            attrs { href = "/skills" }
                            +"Skills"
                        }
                    }
                    styledLi {
                        css(liStyle)
                        styledA {
                            css(aStyle)
                            attrs { href = "/projects" }
                            +"Projects"
                        }
                    }
                }
            }
        }
}