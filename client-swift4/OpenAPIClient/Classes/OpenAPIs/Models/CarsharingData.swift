//
// CarsharingData.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct CarsharingData: Codable {

    public enum ModelType: String, Codable {
        case weshare = "WESHARE"
        case drivenow = "DRIVENOW"
        case car2go = "CAR2GO"
        case jump = "JUMP"
    }
    public var _id: String
    public var lat: Float
    public var lon: Float
    public var type: ModelType

    public init(_id: String, lat: Float, lon: Float, type: ModelType) {
        self._id = _id
        self.lat = lat
        self.lon = lon
        self.type = type
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case lat
        case lon
        case type
    }


}

