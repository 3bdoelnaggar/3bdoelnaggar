import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.dom.*
import react.dom.h3
import styled.css
import styled.styledDiv
import styled.styledH1
import styled.styledImg

fun main() {
    val root = document.getElementById("root")
    console.warn(root)
    render(root) {
        styledDiv {
            styledH1 {
                css {
                    textAlign = TextAlign.center
                    fontSize = 8.em
                }
                +"Abdalla Elnaggar"
            }

            styledDiv {
                css {
                    textAlign = TextAlign.center
                    margin="10"
                }
                styledImg {
                    css {
                        margin="25px"
                    }

                    attrs {
                        width = "100"
                        height = "100"
                        src = "./linkedin.png"
                        onClickFunction = {
                            window.alert("Twitter")

                        }
                    }
                }


                styledImg {
                    css {
                        margin="25px"

                    }

                    attrs {
                        width = "100"
                        height = "100"
                        src = "./twitter.png"
                        onClickFunction = {
                            window.alert("Twitter")

                        }
                    }
                }
                styledImg {
                    css {
                        margin="25px"

                    }
                    attrs {
                        width = "100"
                        height = "100"
                        src = "./github.png"
                        onClickFunction = {
                            window.alert("Twitter")

                        }
                    }
                }
            }
        }

    }


}