package org.setu.placemark

data class PlacemarkModel(
    var id: Long = 0L,
    var title: String = "",
    var description: String = "",
    var lat: String = "",
    var lng: String = ""
)
