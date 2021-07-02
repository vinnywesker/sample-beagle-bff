
package br.com.beaglesampleBackend.builder

import br.com.zup.beagle.ext.setFlex
import br.com.zup.beagle.ext.setStyle
import br.com.zup.beagle.widget.action.Alert
import br.com.zup.beagle.widget.core.*
import br.com.zup.beagle.widget.layout.Container
import br.com.zup.beagle.widget.layout.Screen
import br.com.zup.beagle.widget.layout.ScreenBuilder
import br.com.zup.beagle.widget.ui.Button
import br.com.zup.beagle.widget.ui.Text

class FirstScreenBeagleBuilder : ScreenBuilder {
    override fun build() = Screen(
            child = Container(
                    children = listOf(
                            Text(
                                    text = "Tecnoanjos",
                                    styleId = "TextStyle",
                                    textColor = "red"
                            ).setStyle {
                                    margin = EdgeValue.only(top = 16)
                            },
                            Text(
                                    text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
                            ).setStyle {
                                    margin = EdgeValue.only(top = 20, right = 16, left = 16);
                                    size = Size(height = UnitValue(value = 20.0, type = UnitType.AUTO))
                            },
                            Container(children = listOf(
                                    Text(
                                            text = "Example",
                                            textColor = "red"
                                    ).setFlex {
                                        alignSelf = AlignSelf.CENTER
                                    }.setStyle {
                                        size = Size(
                                                width = UnitValue.real(70), height = UnitValue.real(70),
                                                minWidth = UnitValue.real(30), minHeight = UnitValue.real(30)
                                        )
                                    },
                                    Text(
                                            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
                                            textColor = "red",
                                            alignment = TextAlignment.CENTER
                                    )
                                )
                            ).setStyle {
                                size = Size(
                                        width = UnitValue(300.0, UnitType.REAL)
                                );
                                borderWidth = 2.0;
                                borderColor = "red";
                                margin = EdgeValue.only(top = 25);
                            }//.setFlex {
//                                alignContent = AlignContent.CENTER;
//                                alignItems = AlignItems.CENTER;
//                            }
                            ,
                            Button(
                                text = "Test Button",
                                onPress = listOf(
                                        Alert(message="Button example")
                                )
                            ).setStyle {
                                margin = EdgeValue.only(top = 30);
                            }
                    )
            ).setFlex {
                alignItems = AlignItems.CENTER;
                justifyContent = JustifyContent.CENTER
            }
    )
}