package ${artifactPackage}.docs

import net.jackadull.jackadocs.execution.{JackadocsMain, JackadocsProjectInfo}
import ${artifactPackage}.${infoObjectName}

import scala.language.postfixOps

object Main extends App with JackadocsMain {
  jackadocs generateAt s"$projectDir/README.md" markdownFor ReadmeRoot

  def organizationName = "jackadull"
  def projectDir = ".."
  lazy val projectInfo:JackadocsProjectInfo = new JackadocsProjectInfo with ${infoObjectName}
  def sourceRepoProvider = "github"
}
