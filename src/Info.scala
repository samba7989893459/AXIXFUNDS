package ${artifactPackage}

trait ${infoObjectName} {
  def artifactID:String = "${project.artifactId}"
  def groupID:String = "${project.groupId}"
  def version:String = "${project.version}"
}
object ${infoObjectName} extends ${infoObjectName}
