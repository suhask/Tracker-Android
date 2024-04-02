# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
-keep class dagger.hilt.** { *; }
-keep class dagger.hilt.android.** { *; }
#-keep class javax.inject.** { *; }
#-keep class com.esotericsoftware.** {*;}
#-keep class com.google.auto.service.** {*;}
#-keep class javax.annotation.processing.** {*;}
#-keep class javax.annotation.processing.** {*;}
#-keep class javax.annotation.processing.** {*;}
#-keep class javax.annotation.processing.** {*;}
#-keep class javax.annotation.processing.** {*;}
#-keep class javax.lang.model.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.element.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.type.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.lang.model.util.** {*;}
#-keep class javax.tools.Diagnostic$Kind** {*;}


#-dontwarn com.google.auto.service.AutoService
#-dontwarn javax.annotation.processing.AbstractProcessor
#-dontwarn javax.annotation.processing.Filer
#-dontwarn javax.annotation.processing.Messager
#-dontwarn javax.annotation.processing.ProcessingEnvironment
#-dontwarn javax.annotation.processing.Processor
#-dontwarn javax.lang.model.SourceVersion
#-dontwarn javax.lang.model.element.AnnotationMirror
#-dontwarn javax.lang.model.element.AnnotationValue
#-dontwarn javax.lang.model.element.Element
#-dontwarn javax.lang.model.element.ElementKind
#-dontwarn javax.lang.model.element.ElementVisitor
#-dontwarn javax.lang.model.element.ExecutableElement
#-dontwarn javax.lang.model.element.Modifier
#-dontwarn javax.lang.model.element.Name
#-dontwarn javax.lang.model.element.PackageElement
#-dontwarn javax.lang.model.element.TypeElement
#-dontwarn javax.lang.model.element.TypeParameterElement
#-dontwarn javax.lang.model.element.VariableElement
#-dontwarn javax.lang.model.type.ArrayType
#-dontwarn javax.lang.model.type.DeclaredType
#-dontwarn javax.lang.model.type.ExecutableType
#-dontwarn javax.lang.model.type.TypeKind
#-dontwarn javax.lang.model.type.TypeMirror
#-dontwarn javax.lang.model.type.TypeVariable
#-dontwarn javax.lang.model.type.TypeVisitor
#-dontwarn javax.lang.model.util.AbstractAnnotationValueVisitor8
#-dontwarn javax.lang.model.util.AbstractTypeVisitor8
#-dontwarn javax.lang.model.util.ElementFilter
#-dontwarn javax.lang.model.util.Elements
#-dontwarn javax.lang.model.util.SimpleElementVisitor8
#-dontwarn javax.lang.model.util.SimpleTypeVisitor7
#-dontwarn javax.lang.model.util.SimpleTypeVisitor8
#-dontwarn javax.lang.model.util.Types
#-dontwarn javax.tools.Diagnostic$Kind