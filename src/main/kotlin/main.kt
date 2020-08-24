import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.dom.*
import react.dom.h3
import react.dom.p
import styled.*

fun main() {
    val root = document.getElementById("root")
    console.warn(root)
    render(root) {
        styledDiv {
            styledH1 {
                css {
                    textAlign = TextAlign.center
                    fontSize = 6.em
                }
                +"Abdalla Elnaggar"
            }

            styledDiv {
                css {
                    textAlign = TextAlign.center
                    margin = "10"
                }
                a {
                    attrs {
                        href = "https://www.linkedin.com/in/3bdoelnaggar/"
                    }
                    styledImg {
                        css {
                            margin = "25px"
                        }

                        attrs {
                            width = "100"
                            height = "100"
                            src = "./linkedin.png"
                        }
                    }
                }


                a {
                    attrs {
                        href = "https://twitter.com/3bdoelnaggar/"
                    }
                    styledImg {
                        css {
                            margin = "25px"

                        }

                        attrs {
                            width = "100"
                            height = "100"
                            src = "./twitter.png"

                        }
                    }
                }
                a {
                    attrs {
                        href = "https://github.com/3bdoelnaggar/"
                    }
                    styledImg {
                        css {
                            margin = "25px"

                        }
                        attrs {
                            width = "100"
                            height = "100"
                            src = "./github.png"

                        }
                    }
                }
                a {
                    attrs {
                        href = "https://play.google.com/store/apps/developer?id=Abdalla+Elnaggar"
                    }
                    styledImg {
                        css {
                            margin = "25px"

                        }
                        attrs {
                            width = "100"
                            height = "100"
                            src = "./playstore.png"

                        }
                    }
                }
                styledP {
                    css {
                        position = Position.absolute
                        bottom = 0.px
                        right = 0.px
                        textAlign = TextAlign.right
                        margin="20px"
                    }
                    +"powered by kotlinJS"
                }
            }
        }

    }


}