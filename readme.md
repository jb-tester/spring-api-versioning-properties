## Spring API Versioning test: use config properties for versioning configuration

Branch: dt/spring/api-versioning

Bugs found:
- no versions are shown in Endpoints view
- configured headers are highlighted as 'Unknown HTTP header'
- delete `application.properties`, invoke intention in the `@RequestMapping#version`:
  no results. Should create the property in the `application.yaml` - fixed
- configured headers are highlighted as 'Unknown HTTP header' 
- ~~delete `application.properties`, invoke intention in the `@RequestMapping#version`:
  no results. Should create the property in the `application.yaml`~~ - FIXED
- false-positive inspection for version with some prefix
- no versions in Structure view for functional routes
- no intention in the functional routes with version
- no HTTP Requests generation for versioned functional routes
- ~~no HTTP Requests generation for configurations other than query parameter~~ - FIXED
- ~~incorrect HTTP request for `1.2+`-like versions~~ - OBSOLETE; no specific version is used in all requests, just variable placeholder
- ~~programmatic configurer is not detected unless the header-based versioning is specified~~ - FIXED
- no support for `spring.mvc.apiversion.use.media-type-parameter` property creating: it would be nice to have completion for mediatypes and auto-inserted `[]`
- quickfix for the missing configuration creating doesn't work if both `application.properties` and `application.yaml` exist
- bad style of configuration property adding into the application.yaml (flattened key is added even if the same-prefix keys exist)
- incorrect completion for version properties values in the HTTP Client in case of MediaType option
- completion should suggest the values from the defined(in endpoints) and/or supported properties, not the fixed random set always?
- RestTestClient: no inspection about the not configured API Versioning strategy
