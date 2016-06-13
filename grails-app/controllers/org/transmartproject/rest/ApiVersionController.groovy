package org.transmartproject.rest

/**
 * This controller exposes the version of the api, so that clients can see if they support the current api version.
 * The version number follows semantic versioning: minor number updates indicate backward compatible changes, major
 * number updates indicate backward-incompatible versions. In that case clients will usually need to be updated.
 * Patch levels are not exposed here since clients don't need to know it.
 *
 * If you add a new endpoint to rest-api or you add information to the exported data, you MUST increment the minor
 * version.
 *
 * If you change any functionality in a way that could break clients (e.g. remove endpoints, change data formats or
 * fields, etc), you MUST increment the major number.
 *
 * In both cases you MUST document the changes in the CHANGES file.
 *
 * This version number is purely for api compatibility, it is not related to the transmart release version number.
 *
 * This endpoint was introduced with version 3.0, previous versions do not have a /transmart-rest-api-version
 * endpoint at all.
 */
class ApiVersionController {

    static responseFormats = ['json', 'hal']

    // See CHANGES for what changes were done in which version number
    def index() {
        render "3.0\n"
    }

}
