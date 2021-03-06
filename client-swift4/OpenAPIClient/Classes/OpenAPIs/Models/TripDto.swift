//
// TripDto.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct TripDto: Codable {

    public var cancelled: Bool
    public var delay: Int?
    public var departureTime: Date
    public var direction: String
    public var directionToDisplay: String
    public var platform: String?
    public var trainIdentifier: String
    public var vehicleType: String
    public var via: [String]
    public var viaToDisplay: String?

    public init(cancelled: Bool, delay: Int?, departureTime: Date, direction: String, directionToDisplay: String, platform: String?, trainIdentifier: String, vehicleType: String, via: [String], viaToDisplay: String?) {
        self.cancelled = cancelled
        self.delay = delay
        self.departureTime = departureTime
        self.direction = direction
        self.directionToDisplay = directionToDisplay
        self.platform = platform
        self.trainIdentifier = trainIdentifier
        self.vehicleType = vehicleType
        self.via = via
        self.viaToDisplay = viaToDisplay
    }


}

