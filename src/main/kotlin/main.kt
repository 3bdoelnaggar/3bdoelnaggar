import kotlinx.browser.document
import kotlinx.browser.window
import kotlinx.css.*
import kotlinx.html.js.onClickFunction
import react.dom.*
import react.dom.h3
import react.dom.p
import styled.*
import styled.StyledComponents.css

fun main() {
   val apps= "I have around 10 apps most of them was the learning purpose and many of the stopped supportig and may have issues " +
           "the tow main projects that I am still support and working on from time to time is مطاعم الاسكندرية and صيادين الاسكندرية"
    val root = document.getElementById("root")
    val briefAboutMe = "Android Developer who played with Java Kotlin Retrofit MVP MVVM MVI Room Koin Files and Git , Started My first App in 2015 five users ago " +
            ", Now developed intrest in Koltin js"

    console.warn(root)
    render(root) {
        child(HeaderComponent::class){}
        styledDiv {
            styledH1 {
                css {
                    textAlign = TextAlign.center
                    fontSize = 6.em
                }
                +"Abdalla Elnaggar"
            }
            styledP {
                css {
                    textAlign = TextAlign.center
                    fontSize = 2.em
                }
                +briefAboutMe
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


                    styledDiv {
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
                    }
                    styledP {
                        css {
                            position = Position.absolute
                            bottom = 0.px
                            right = 0.px
                            textAlign = TextAlign.right
                            margin = "20px"
                        }
                        +"powered by kotlinJS"
                    }
                }
            }
        }
    }
