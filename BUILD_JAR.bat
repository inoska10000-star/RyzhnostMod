\
@echo off
echo Building Ryzhnost mod...
echo.
echo Требуется Java 21 и установленный Gradle.
echo Если Gradle не установлен, установи его или открой проект в IntelliJ IDEA.
echo.

gradle build

echo.
echo Если сборка прошла успешно, jar лежит тут:
echo build\libs\
pause
