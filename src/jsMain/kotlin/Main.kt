import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.AttrsScope
import org.jetbrains.compose.web.css.*
import org.jetbrains.compose.web.dom.*
import org.jetbrains.compose.web.renderComposable
import org.w3c.dom.HTMLDivElement
import org.w3c.dom.HTMLImageElement

fun main() {

    renderComposable(rootElementId = "root") {
        Div({
            style {
                paddingTop(100.px)
                textAlign("center")
            }
        }) {

            Div({
                style {
                    fontSize(60.px)
                    textAlign("center")
                }
            }) {
                Span({
                    style {
                        fontSize(100.px)
                    }
                }) {
                    Text("Abdalla Elnaggar")
                }
            }
            val attrs: AttrsScope<HTMLImageElement>.() -> Unit = {
                style {
                    width(100.px)
                    height(100.px)
                    padding(20.px)
                }
            }
            Div({
                style {
                    width(100.pc)
                    alignContent(AlignContent.Center)
                }
            }) {

                PlatformLink("./linkedin.png", "https://www.linkedin.com/in/3bdoelnaggar/", attrs)
                PlatformLink("./github.png", "https://github.com/3bdoelnaggar/", attrs)
                PlatformLink("./playstore.png", "https://play.google.com/store/apps/developer?id=Abdalla+Elnaggar", attrs)
                PlatformLink("./twitter.png", "https://twitter.com/3bdoelnaggar/", attrs)

            }


            val itemInArticleAndProjectStyle: AttrsScope<HTMLDivElement>.() -> Unit = {
                style {
                    fontSize(24.px)
                    marginBottom(5.px)
                    color(Color.black)
                }
            }

            Div({
                style {
                    textAlign("left")
                    marginLeft(60.px)
                }
            }) {
                Div({
                    style {
                        fontSize(48.px)
                    }
                })
                {
                    Text("Articles")


                    Div(itemInArticleAndProjectStyle) {
                        A("https://dev.to/3bdoelnaggar/i-love-compound-view-73d") {
                            Span({
                                style {
                                    color(Color.black)
                                }
                            }) {
                                Text("I love Compound View ")
                            }
                        }
                    }
                    Div(itemInArticleAndProjectStyle) {
                        A("https://dev.to/3bdoelnaggar/viewmodel-runtime-dependencies-or-not-4c32") {
                            Span({
                                style {
                                    color(Color.black)
                                }
                            }) {
                                Text("ViewModel runtime dependencies or not?")
                            }
                        }
                    }
                    Div(itemInArticleAndProjectStyle) {
                        A("https://dev.to/3bdoelnaggar/gson-and-r8-force-final-object-to-be-null-at-runtime-46l2") {
                            Span({
                                style {
                                    color(Color.black)
                                }
                            }) {
                                Text("Gson and R8 force final object to be null at runtime ")
                            }
                        }
                    }
                    Div(itemInArticleAndProjectStyle) {
                        A("https://www.linkedin.com/pulse/what-you-want-change-app-name-based-build-type-support-elnaggar/?lipi=urn%3Ali%3Apage%3Ad_flagship3_profile_view_base_post_details%3B1Fwc%2BqtCQxCEP1S1vcNnHQ%3D%3D") {
                            Span({
                                style {
                                    color(Color.black)
                                }
                            }) {
                                Text("What if you want to change the app name based on build type but support localization at the same time")
                            }
                        }
                    }
                    Link(
                        "Build variant with google play services",
                        "https://3bdoelnaggar.medium.com/build-variant-with-google-play-services-c70c447775cb",
                        itemInArticleAndProjectStyle
                    )
                }
                Div({
                    style {
                        fontSize(48.px)
                        marginTop(20.px)
                    }
                }) {
                    Text("Projects")

                    Link("صيارين الاسكندرية","https://play.google.com/store/apps/details?id=elnaggar.alexfishers",itemInArticleAndProjectStyle)

                    Link("مطاعم الاسكندرية","https://play.google.com/store/apps/details?id=elnaggar.alexandriarestaurants",itemInArticleAndProjectStyle)
                    Link("جدول الحصص","https://play.google.com/store/apps/details?id=elnaggar.gadwalelhesas",itemInArticleAndProjectStyle)

                }

            }
        }
    }
}

@Composable
fun Link(title: String, url: String, itemInArticleAndProjectStyle: AttrsScope<HTMLDivElement>.() -> Unit) {
    Div(itemInArticleAndProjectStyle) {
        A(url) {
            Span({
                style {
                    color(Color.black)
                }
            }) {
                Text(title)
            }
        }
    }
}

@Composable
fun PlatformLink(imageUrl: String, link: String, attrs: AttrBuilderContext<HTMLImageElement>?) {
    A(href = link) {
        Img(attrs = attrs, src = imageUrl)
    }

}

