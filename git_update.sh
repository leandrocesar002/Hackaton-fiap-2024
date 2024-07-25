#!/bin/bash

# Verifique a versão passada
if [ "$1" == "-v" ] && [ -n "$2" ]; then
  VERSION_TYPE=$2
else
  echo "Usage: $0 -v [major|minor|patch]"
  exit 1
fi

# Obtenha a última tag do Git
LAST_TAG=$(git describe --tags `git rev-list --tags --max-count=1`)

# Incrementa a versão
IFS='.' read -r -a VERSION_PARTS <<< "$LAST_TAG"

if [ "$VERSION_TYPE" == "major" ]; then
  NEW_TAG="$((VERSION_PARTS[0]+1)).0.0"
elif [ "$VERSION_TYPE" == "minor" ]; then
  NEW_TAG="${VERSION_PARTS[0]}.$((VERSION_PARTS[1]+1)).0"
elif [ "$VERSION_TYPE" == "patch" ]; then
  NEW_TAG="${VERSION_PARTS[0]}.${VERSION_PARTS[1]}.$((VERSION_PARTS[2]+1))"
else
  echo "Invalid version type. Use major, minor, or patch."
  exit 1
fi

# Crie uma nova tag
git tag $NEW_TAG
git push origin $NEW_TAG

# Retorna a nova tag
echo $NEW_TAG
