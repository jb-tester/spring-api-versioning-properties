## Spring API Versioning test: use config properties for versioning configuration

Branch: dt/spring/api-versioning

Bugs found:
- no versions are shown in Endpoints view
- configured headers are highlighted as 'Unknown HTTP header'
- delete `application.properties`, invoke intention in the `@RequestMapping#version`:
  no results. Should create the property in the `application.yaml` - fixed
- false-positive inspection for version with some prefix
- no versions in Structure view for functional routes
- no intention in the functional routes with version
- no HTTP Requests generation for versioned functional routes
- no HTTP Requests generation for configurations other than query parameter
- incorrect HTTP request for `1.2+`-like versions
- programmatic configurer is not detected unless the header-based versioning is specified
- no support for `spring.mvc.apiversion.use.media-type-parameter` property creating: it would be nice to have completion for mediatypes and auto-inserted `[]`

